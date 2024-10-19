package com.mavenjunitproject;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        return true;
    }

    @Test
    public void testPalindrome() {
        assertTrue(PalindromeCheck.isPalindrome("madam")); 
        assertFalse(PalindromeCheck.isPalindrome("hello"));
    }
}
