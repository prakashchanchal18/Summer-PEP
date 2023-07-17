package com.company;

import java.util.Scanner;
public class July9_Tries {
    // Trie are generally used in strings that to in string matching algorithm.

    // Problem Statement - You are given with a set of words called 'S,'
    // your task is to find (word) if that exist in the 'S' word or not.
    // S = {"the", "there", "their", "bear", "beer", "bid", "bitter"}

    // NOTE: - The root of the TRIE does not contain any value it only contains the details of its children.
    // NOTE: - Children set for a leaf node will be an empty set.
    // NOTE: - Search - O(n) -- n = number of letter in a pattern.
    // NOTE: - Insert - O(n) -- n = number of letter in the word.
    // Imp**  NOTE: - The value for end of the word (eow) is always false for the root.

    static Node root;
    static class Node {
        Node[] children = new Node[26];
        boolean eow;
        Node() {
            this.eow = false;
            for(int i=0; i<26; i++) {
                children[i] = null;
            }
        }
    }
    public static void insert(String word) {
        Node temp = root;
        int length = word.length();
        for(int level=0; level<length; level++) {
            int index = word.charAt(level) - 'a';
            if(temp.children[index] == null) {
                temp = temp.children[index];
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n is total number of words in set S
        int n = sc.nextInt();
        String[] S = new String[n];
        for(int i=0; i<n; i++) {
            S[i] = sc.next();
        }
        for(int i=0; i<n; i++) {
            insert(S[i]);
        }
    }
}
