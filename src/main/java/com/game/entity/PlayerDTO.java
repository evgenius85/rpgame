package com.game.entity;

import com.game.controller.PlayerOrder;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class PlayerDTO {
    private String name = "";
    private String title = "";

    private Race race;
    private Profession profession;

    private Long after;
    private Long before;

    private Boolean banned;

    private Long minExperience;
    private Long maxExperience;

    private Long minLevel;
    private Long maxLevel;

    private Long pageNumber = 0L;
    private Long pageSize = 3L;

    @Enumerated(EnumType.STRING)
    private PlayerOrder playerOrder = PlayerOrder.ID;

    public PlayerDTO() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public Long getBefore() {
        return before;
    }

    public void setBefore(Long before) {
        this.before = before;
    }

    public Long getAfter() {
        return after;
    }

    public void setAfter(Long after) {
        this.after = after;
    }

    public Boolean getBanned() {
        return banned;
    }

    public void setBanned(Boolean banned) {
        this.banned = banned;
    }

    public Long getMinExperience() {
        return minExperience;
    }

    public void setMinExperience(Long minExperience) {
        this.minExperience = minExperience;
    }

    public Long getMaxExperience() {
        return maxExperience;
    }

    public void setMaxExperience(Long maxExperience) {
        this.maxExperience = maxExperience;
    }

    public Long getMinLevel() {
        return minLevel;
    }

    public void setMinLevel(Long minLevel) {
        this.minLevel = minLevel;
    }

    public Long getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(Long maxLevel) {
        this.maxLevel = maxLevel;
    }

    public Long getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public PlayerOrder getPlayerOrder() {
        return playerOrder;
    }

    public void setPlayerOrder(PlayerOrder playerOrder) {
        this.playerOrder = playerOrder;
    }

    @Override
    public String toString() {
        return "PlayerDTO{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", race=" + race +
                ", profession=" + profession +
                ", birthdayAfter=" + after +
                ", birthdayBefore=" + before +
                ", banned=" + banned +
                ", minExperience=" + minExperience +
                ", maxExperience=" + maxExperience +
                ", minLevel=" + minLevel +
                ", maxLevel=" + maxLevel +
                ", pageNumber=" + pageNumber +
                ", pageSize=" + pageSize +
                ", order='" + playerOrder + '\'' +
                '}';
    }
}
