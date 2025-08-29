package com.example;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    private Playwright playwright;
    private Browser browser;
    private Page page;

    @BeforeEach
    public void setUp() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true));
        page = browser.newPage();
    }

    @AfterEach
    public void tearDown() {
        page.close();
        browser.close();
        playwright.close();
    }

    @Test
    public void testAppFunctionality() {
        page.navigate("https://www.google.com/"); // Adjust the URL as needed
        String title = page.title();
        assertEquals("Google", title); // Replace with the expected title
        System.out.println("Page title is: " + title);
    }
}