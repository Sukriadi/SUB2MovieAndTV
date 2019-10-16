package com.example.sub2movieandtv;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
    private String name;
    private String overview;
    private String user_score;
    private String status;
    private String language;
    private String runtime;
    private String budget;
    private String revenue;
    private String photo;
    private String genre;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getYear_in() {
        return year_in;
    }

    public void setYear_in(String year_in) {
        this.year_in = year_in;
    }

    private String year_in;

    public String getUser_score() {
        return user_score;
    }

    public void setUser_score(String user_score) {
        this.user_score = user_score;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOriginal_language() {
        return language;
    }

    public void setOriginal_language(String original_language) {
        this.language = original_language;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getRevenue() {
        return revenue;
    }

    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.overview);
        dest.writeString(this.user_score);
        dest.writeString(this.status);
        dest.writeString(this.language);
        dest.writeString(this.runtime);
        dest.writeString(this.budget);
        dest.writeString(this.revenue);
        dest.writeString(this.photo);
        dest.writeString(this.genre);
        dest.writeString(this.year_in);
    }

    public Movie() {
    }

    protected Movie(Parcel in) {
        this.name = in.readString();
        this.overview = in.readString();
        this.user_score = in.readString();
        this.status = in.readString();
        this.language = in.readString();
        this.runtime = in.readString();
        this.budget = in.readString();
        this.revenue = in.readString();
        this.photo = in.readString();
        this.genre = in.readString();
        this.year_in = in.readString();
    }

    public static final Parcelable.Creator<Movie> CREATOR = new Parcelable.Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel source) {
            return new Movie(source);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };
}
