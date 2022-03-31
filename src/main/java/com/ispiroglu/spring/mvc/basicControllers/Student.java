package com.ispiroglu.spring.mvc.basicControllers;


import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private LinkedHashMap<String, String> countryOptions;
    private String favouriteLanguage;
    private LinkedHashMap<String, String> favouriteLanguageOptions;
    private String[] operatingSystems;

    public Student()
    {
        // populate country options
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("BR", "Brazil");
        countryOptions.put("FR", "France");
        countryOptions.put("DE", "Germany");
        countryOptions.put("TR", "Turkey");

        favouriteLanguageOptions = new LinkedHashMap<>();
        favouriteLanguageOptions.put("Java", "Java");
        favouriteLanguageOptions.put("Go", "Go");
        favouriteLanguageOptions.put("C#", "C#");
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public LinkedHashMap<String, String> getFavouriteLanguageOptions() {
        return favouriteLanguageOptions;
    }

    public void setFavouriteLanguageOptions(LinkedHashMap<String, String> favouriteLanguageOptions) {
        this.favouriteLanguageOptions = favouriteLanguageOptions;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }
}
