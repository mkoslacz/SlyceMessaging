package it.slyce.messaging.message;

import android.content.Context;
import android.graphics.drawable.Drawable;

import it.slyce.messaging.message.messageItem.MessageItem;

/**
 * Created by matthewpage on 6/21/16.
 */
public abstract class Message {
    long date;
    MessageSource source;
    Drawable avatarDrawable;
    String avatarUrl;
    String displayName;
    String userId;
    String initials;

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public MessageSource getSource() {
        return source;
    }

    public void setSource(MessageSource source) {
        this.source = source;
    }

    public Drawable getAvatarDrawable() {
        return avatarDrawable;
    }

    public void setAvatarDrawable(Drawable avatarDrawable) {
        this.avatarDrawable = avatarDrawable;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public abstract MessageItem toMessageItem(Context context);
}
