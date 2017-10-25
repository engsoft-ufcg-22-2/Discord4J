/*
 * This file is part of Discord4J.
 *
 * Discord4J is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Discord4J is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Discord4J.  If not, see <http://www.gnu.org/licenses/>.
 */
package discord4j.rest.service;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import discord4j.common.jackson.Possible;
import discord4j.common.jackson.PossibleModule;
import discord4j.common.json.request.*;
import discord4j.rest.http.EmptyReaderStrategy;
import discord4j.rest.http.EmptyWriterStrategy;
import discord4j.rest.http.JacksonReaderStrategy;
import discord4j.rest.http.JacksonWriterStrategy;
import discord4j.rest.http.client.SimpleHttpClient;
import discord4j.rest.request.Router;
import discord4j.rest.route.Routes;
import org.junit.Test;

import java.util.Collections;

public class GuildServiceTest {

	private static final long guild = Long.parseUnsignedLong(System.getenv("guild"));
	private static final long member = Long.parseUnsignedLong(System.getenv("member"));
	private static final long permanentRole = Long.parseUnsignedLong(System.getenv("permanentRole"));
	private static final String trashCategory = System.getenv("trashCategory");

	private GuildService guildService = null;

	private GuildService getGuildService() {

		if (guildService != null) return guildService;

		String token = System.getenv("token");
		ObjectMapper mapper = getMapper();

		SimpleHttpClient httpClient = SimpleHttpClient.builder()
				.baseUrl(Routes.BASE_URL)
				.defaultHeader("Authorization", "Bot " + token)
				.defaultHeader("Content-Type", "application/json")
				.readerStrategy(new JacksonReaderStrategy<>(mapper))
				.readerStrategy(new EmptyReaderStrategy())
				.writerStrategy(new JacksonWriterStrategy(mapper))
				.writerStrategy(new EmptyWriterStrategy())
				.build();

		Router router = new Router(httpClient);

		return guildService = new GuildService(router);
	}

	private ObjectMapper getMapper() {
		return new ObjectMapper()
				.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY)
				.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true)
				.registerModule(new PossibleModule());
	}

	@Test
	public void testGetGuild() {
		getGuildService().getGuild(guild).block();
	}

	@Test
	public void testModifyGuild() {
		GuildModifyRequest req = new GuildModifyRequest(Possible.absent(), Possible.of("us-south"), Possible.absent(),
				Possible.absent(), Possible.absent(), Possible.absent(), Possible.absent(), Possible.absent(),
				Possible.absent());
		getGuildService().modifyGuild(guild, req).block();
	}

	@Test
	public void testGetGuildChannels() {
		getGuildService().getGuildChannels(guild).block();
	}

	@Test
	public void testCreateGuildChannel() {
		String randomName = Long.toHexString(Double.doubleToLongBits(Math.random()));
		ChannelCreateRequest req = new ChannelCreateRequest(randomName, Possible.absent(), Possible.absent(),
				Possible.absent(), Possible.absent(), Possible.of(trashCategory), Possible.absent());
		getGuildService().createGuildChannel(guild, req).block();
	}

	@Test
	public void testModifyGuildChannelPositions() {
		// TODO
	}

	@Test
	public void testGetGuildMember() {
		getGuildService().getGuildMember(guild, member).block();
	}

	@Test
	public void testGetGuildMembers() {
		getGuildService().getGuildMembers(guild, Collections.emptyMap()).block();
	}

	@Test
	public void testModifyGuildMember() {
		GuildMemberModifyRequest req = new GuildMemberModifyRequest(Possible.of("nickname"), Possible.absent(),
				Possible.absent(), Possible.absent(), Possible.absent());
		getGuildService().modifyGuildMember(guild, member, req).block();
	}

	@Test
	public void testModifyOwnNickname() {
		NicknameModifyRequest req = new NicknameModifyRequest("nickname");
		getGuildService().modifyOwnNickname(guild, req).block();
	}

	@Test
	public void testAddGuildMemberRole() {
		// TODO
	}

	@Test
	public void testRemoveGuildMemberRole() {
		// TODO
	}

	@Test
	public void testRemoveGuildMember() {
		// TODO
	}

	@Test
	public void testGetGuildBans() {
		getGuildService().getGuildBans(guild).block();
	}

	@Test
	public void testCreateGuildBan() {
		// TODO
	}

	@Test
	public void testRemoveGuildBan() {
		// TODO
	}

	@Test
	public void testGetGuildRoles() {
		getGuildService().getGuildRoles(guild).block();
	}

	@Test
	public void testCreateGuildRole() {
		String randomName = Long.toHexString(Double.doubleToLongBits(Math.random()));
		RoleCreateRequest req = new RoleCreateRequest(randomName, 0, 0, false, false);
		getGuildService().createGuildRole(guild, req).block();
	}

	@Test
	public void testModifyGuildRolePositions() {
		// TODO
	}

	@Test
	public void testModifyGuildRole() {
		RoleModifyRequest req = new RoleModifyRequest(Possible.absent(), Possible.of(0), Possible.absent(),
				Possible.absent(), Possible.absent());
		getGuildService().modifyGuildRole(guild, permanentRole, req).block();
	}

	@Test
	public void testDeleteGuildRole() {
		// TODO
	}

	@Test
	public void testGetGuildPruneCount() {
		getGuildService().getGuildPruneCount(guild, Collections.emptyMap()).block();
	}

	@Test
	public void testBeginGuildPrune() {
		// shouldn't actually prune anyone because everyone in test server should have a role
		getGuildService().beginGuildPrune(guild, Collections.emptyMap()).block();
	}

	@Test
	public void testGetGuildVoiceRegions() {
		getGuildService().getGuildVoiceRegions(guild).block();
	}

	@Test
	public void testGetGuildInvites() {
		getGuildService().getGuildInvites(guild).block();
	}

	@Test
	public void testGetGuildIntegrations() {
		getGuildService().getGuildIntegrations(guild).block();
	}

	@Test
	public void testCreateGuildIntegration() {
		// TODO
	}

	@Test
	public void testModifyGuildIntegration() {
		// TODO
	}

	@Test
	public void testDeleteGuildIntegration() {
		// TODO
	}

	@Test
	public void testSyncGuildIntegration() {
		// TODO
	}

	@Test
	public void testGetGuildEmbed() {
		getGuildService().getGuildEmbed(guild).block();
	}

	@Test
	public void testModifyGuildEmbed() {
		// TODO
	}
}
