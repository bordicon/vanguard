package com.arcaner.vanguard.proto;

public class BadChecksum extends Exception {
    public BadChecksum(long got, long expected) {
        super(String.format("Bad checksum. Got %08X, expected %08X", got, expected));
    }
}
