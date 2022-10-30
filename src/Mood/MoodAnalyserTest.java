package Mood;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class MoodAnalyserTest {
    @Test
    void testMoodAnalysis() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a sad message");
        assertThat(mood, CoreMatchers.is("SAD"));
    }

    @Test
    void HappyMoods() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a happy message");
        assertThat(mood, CoreMatchers.is("HAPPY"));
    }
}


// commands from intelliJ
//  Press Ctrl+Shift+F10 to run this individual test.
//  Shift+F10 to re-run the last test.
//  Run second test case by pressing Alt+Shift+R