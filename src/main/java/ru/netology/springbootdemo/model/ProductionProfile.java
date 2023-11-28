package ru.netology.springbootdemo.model;

import ru.netology.springbootdemo.interfaces.SystemProfile;

public class ProductionProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}
