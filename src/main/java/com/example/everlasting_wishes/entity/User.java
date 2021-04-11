package com.example.everlasting_wishes.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;

    @Column(name = "user_nick_name")
    private String nickName;

    @Column(name = "user_avatar_url")
    private String avatarURL;

    @Column(name = "user_rank")
    private String rank;

    @Column(name = "user_description")
    private String description;

    @Column(name = "user_activity")
    private String activity;

    public User() {
    }

    public User(int id, String nickName, String avatarURL, String rank, String description, String activity) {
        this.id = id;
        this.nickName = nickName;
        this.avatarURL = avatarURL;
        this.rank = rank;
        this.description = description;
        this.activity = activity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatarURL() {
        return avatarURL;
    }

    public void setAvatarURL(String avatarURL) {
        this.avatarURL = avatarURL;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }
}
