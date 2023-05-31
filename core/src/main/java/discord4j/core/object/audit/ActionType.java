package discord4j.core.object.audit;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents the various type of audit log action.
 * See <a href="https://discord.com/developers/docs/resources/audit-log#audit-log-entry-object-audit-log-events">
 *     Audit Log Events</a>
 */
public enum ActionType {

    UNKNOWN(-1),
    GUILD_UPDATE(1),
    CHANNEL_CREATE(10),
    CHANNEL_UPDATE(11),
    CHANNEL_DELETE(12),
    CHANNEL_OVERWRITE_CREATE(13),
    CHANNEL_OVERWRITE_UPDATE(14),
    CHANNEL_OVERWRITE_DELETE(15),
    MEMBER_KICK(20),
    MEMBER_PRUNE(21),
    MEMBER_BAN_ADD(22),
    MEMBER_BAN_REMOVE(23),
    MEMBER_UPDATE(24),
    MEMBER_ROLE_UPDATE(25),
    MEMBER_MOVE(26),
    MEMBER_DISCONNECT(27),
    BOT_ADD(28),
    ROLE_CREATE(30),
    ROLE_UPDATE(31),
    ROLE_DELETE(32),
    INVITE_CREATE(40),
    INVITE_UPDATE(41),
    INVITE_DELETE(42),
    WEBHOOK_CREATE(50),
    WEBHOOK_UPDATE(51),
    WEBHOOK_DELETE(52),
    EMOJI_CREATE(60),
    EMOJI_UPDATE(61),
    EMOJI_DELETE(62),
    MESSAGE_DELETE(72),
    MESSAGE_BULK_DELETE(73),
    MESSAGE_PIN(74),
    MESSAGE_UNPIN(75),
    INTEGRATION_CREATE(80),
    INTEGRATION_UPDATE(81),
    INTEGRATION_DELETE(82),
    AUTO_MODERATION_RULE_CREATE(140),
    AUTO_MODERATION_RULE_UPDATE(141),
    AUTO_MODERATION_RULE_DELETE(142),
    AUTO_MODERATION_BLOCK_MESSAGE(143),
    AUTO_MODERATION_FLAG_TO_CHANNEL(144),
    AUTO_MODERATION_USER_COMMUNICATION_DISABLED(145);

    private static final Map<Integer, ActionType> ACTION_TYPE_MAP = new HashMap<>();

    static {
        for (ActionType actionType : ActionType.values()) {
            ACTION_TYPE_MAP.put(actionType.getValue(), actionType);
        }
    }

    /**
     * Gets the type of action. It is guaranteed that invoking {@link #getValue()} from the returned enum will equal
     * ({@link #equals(Object)}) the supplied {@code value}.
     *
     * @param value The underlying value as represented by Discord.
     * @return The type of action.
     */
    public static ActionType of(final int value) {
        return ACTION_TYPE_MAP.getOrDefault(value, UNKNOWN);
    }

    private final int value;

    ActionType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
