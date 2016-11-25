package it.slyce.messaging;

import it.slyce.messaging.message.Message;

import java.util.List;

/**
 * Created by mateuszkoslacz on 05.11.2016.
 */
public class MessagingEvent {
    public static final int ADD_NEW_MESSGES = 433;
    public static final int REPLACE_MESSAGES = 663;
    public static final int UPDATE_TIMESTAMPS = 931;

    private int mActionType;
    private List<Message> mMessages;
    private int mUpTo;

    private MessagingEvent(Builder builder) {
        mActionType = builder.mActionType;
        mMessages = builder.mMessages;
        mUpTo = builder.mUpTo;
    }

    public int getActionType() {
        return mActionType;
    }

    public List<Message> getMessages() {
        return mMessages;
    }

    public int getUpTo() {
        return mUpTo;
    }

    public static final class Builder {
        private int mActionType;
        private List<Message> mMessages;
        private int mUpTo;

        public Builder() {
        }

        public Builder withActionType(int actionType) {
            this.mActionType = actionType;
            return this;
        }

        public Builder withMessages(List<Message> messages) {
            this.mMessages = messages;
            return this;
        }

        public Builder withUpTo(int upTo) {
            this.mUpTo = upTo;
            return this;
        }

        public MessagingEvent build() {
            return new MessagingEvent(this);
        }
    }
}
