package com.example.profiles;

/**
 * Mutable and confusing. Multiple constructors + setters.
 */
public final class UserProfile {

    private final String id;
    private final String email;
    private final String phone;
    private final String displayName;
    private final String address;
    private final boolean marketingOptIn;
    private final String twitter;
    private final String github;

    public UserProfile(Builder builder) {
        this.id = builder.id;
        this.email = builder.email;
        this.phone = builder.phone;
        this.displayName = builder.displayName;
        this.address = builder.address;
        this.marketingOptIn = builder.marketingOptIn;
        this.twitter = builder.twitter;
        this.github = builder.github;
    }

    // getters
    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getAddress() {
        return address;
    }

    public boolean isMarketingOptIn() {
        return marketingOptIn;
    }

    public String getTwitter() {
        return twitter;
    }

    public String getGithub() {
        return github;
    }

    //class responsible for buidling the object of outer class
    static class Builder {

        private String id;
        private String email;
        private String phone;
        private String displayName;
        private String address;
        private boolean marketingOptIn;
        private String twitter;
        private String github;

        Builder setId(String id) {
            this.id = id;
            return this;
        }

        Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        Builder setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        Builder setMarketingOptIn(Boolean marketingOptIn) {
            this.marketingOptIn = marketingOptIn;
            return this;
        }

        Builder setTwitter(String twitter) {
            this.twitter = twitter;
            return this;
        }

        Builder setGithub(String github) {
            this.github = github;
            return this;
        }

        public UserProfile build() {
            Validation.requireNonBlank(this.id, "id");
            Validation.requireNonBlank(this.email, "email");
            Validation.requireEmail(this.email);
            return new UserProfile(this);
        }

    }
}
