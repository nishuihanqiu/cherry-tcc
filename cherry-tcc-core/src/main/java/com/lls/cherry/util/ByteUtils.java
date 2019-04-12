package com.lls.cherry.util;

import java.nio.ByteBuffer;
import java.util.UUID;

/************************************
 * ByteUtils
 * @author liliangshan
 * @date 2019-04-11
 ************************************/
public class ByteUtils {

    public static byte[] longToBytes(long number) {
        return String.valueOf(number).getBytes();
    }

    public static long bytesToLong(byte[] bytes) {
        return Long.valueOf(new String(bytes));
    }

    public static byte[] intToBytes(int number) {
        return String.valueOf(number).getBytes();
    }

    public static int bytesToInt(byte[] bytes) {
        return Integer.valueOf(new String(bytes));
    }

    public static UUID bytesToUUID(byte[] bytes) {
        ByteBuffer buffer = ByteBuffer.wrap(bytes);
        long firstLong = buffer.getLong();
        long secondLong = buffer.getLong();
        return new UUID(firstLong, secondLong);
    }

    public static byte[] uuidToBytes(UUID uuid) {
        ByteBuffer buffer = ByteBuffer.wrap(new byte[16]);
        buffer.putLong(uuid.getMostSignificantBits());
        buffer.putLong(uuid.getLeastSignificantBits());
        return buffer.array();
    }


}
