package com.example.pokiapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class GitUsersResponse {
    @SerializedName("total_count")
    public int total_count;
    @SerializedName("items")
    public List<GitUser> users=new ArrayList<>();

}
