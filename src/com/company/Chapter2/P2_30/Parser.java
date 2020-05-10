package com.company.Chapter2.P2_30;

import java.util.LinkedList;

public class Parser {

    public void parse(LinkedList<Character> characters) {
        for (Character character : characters) {
            countLetters(character);
        }
    }

    private void countLetters(Character character) {

        switch (character) {
            case 'a':
            case 'A':
                Alphabet.a.number += 1;
                break;
            case 'b':
            case 'B':
                Alphabet.b.number += 1;
                break;
            case 'c':
            case 'C':
                Alphabet.c.number += 1;
                break;
            case 'd':
            case 'D':
                Alphabet.d.number += 1;
                break;
            case 'e':
            case 'E':
                Alphabet.e.number += 1;
                break;
            case 'f':
            case 'F':
                Alphabet.f.number += 1;
                break;
            case 'g':
            case 'G':
                Alphabet.g.number += 1;
                break;
            case 'h':
            case 'H':
                Alphabet.h.number += 1;
                break;
            case 'i':
            case 'I':
                Alphabet.i.number += 1;
                break;
            case 'j':
            case 'J':
                Alphabet.j.number += 1;
                break;
            case 'k':
            case 'K':
                Alphabet.k.number += 1;
                break;
            case 'l':
            case 'L':
                Alphabet.l.number += 1;
                break;
            case 'm':
            case 'M':
                Alphabet.m.number += 1;
                break;
            case 'n':
            case 'N':
                Alphabet.n.number += 1;
                break;
            case 'o':
            case 'O':
                Alphabet.o.number += 1;
                break;
            case 'p':
            case 'P':
                Alphabet.p.number += 1;
                break;
            case 'q':
            case 'Q':
                Alphabet.q.number += 1;
                break;
            case 'r':
            case 'R':
                Alphabet.r.number += 1;
                break;
            case 's':
            case 'S':
                Alphabet.s.number += 1;
                break;
            case 't':
            case 'T':
                Alphabet.t.number += 1;
                break;
            case 'u':
            case 'U':
                Alphabet.u.number += 1;
                break;
            case 'v':
            case 'V':
                Alphabet.v.number += 1;
                break;
            case 'w':
            case 'W':
                Alphabet.w.number += 1;
                break;
            case 'x':
            case 'X':
                Alphabet.x.number += 1;
                break;
            case 'y':
            case 'Y':
                Alphabet.y.number += 1;
                break;
            case 'z':
            case 'Z':
                Alphabet.z.number += 1;
                break;

            default:
                break;
        }
    }
}
