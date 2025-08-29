package com.example;

import com.microsoft.playwright.Playwright;

public class App {
    public static void main(String[] args) {
        // Initialize Playwright
        try (Playwright playwright = Playwright.create()) {
            // Your automation scripts or tests go here
            System.out.println("Playwright initialized successfully.");
        } catch (Exception e) {
            System.err.println("Error initializing Playwright: " + e.getMessage());
        }
    }
}