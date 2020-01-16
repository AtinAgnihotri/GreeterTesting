package com.example.greeter;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
//import static androidx.test.espresso.

import org.junit.Rule;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityTests {
    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testGreet(){
        // Type BC into greetEditText
        onView(withId(R.id.greetEditText)).perform(typeText("BC"), closeSoftKeyboard());
        // Press Greet Button
        onView(withId(R.id.greetButton)).perform(click());
        // Check if the text in greetTextView is "Hello BC!"
        onView(withId(R.id.greetTextView)).check(matches(withText("Hello BC!")));
    }
}
