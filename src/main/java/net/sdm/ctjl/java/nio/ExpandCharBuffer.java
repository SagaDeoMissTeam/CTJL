package net.sdm.ctjl.java.nio;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.nio.CharBuffer;

@ZenRegister
@NativeTypeRegistration(value = CharBuffer.class, zenCodeName = "mods.ctjl.java.nio.CharBuffer")
public class ExpandCharBuffer {

    @ZenCodeType.Method
    @ZenCodeType.Getter("getChar")
    public static char getChar(CharBuffer buffer) {
        return buffer.get();
    }

    @ZenCodeType.Method
    public static char charAt(CharBuffer buffer, int index) {
        return buffer.charAt(index);
    }

    @ZenCodeType.Method
    public static char getCharget(CharBuffer buffer, int index) {
        return buffer.get(index);
    }

    @ZenCodeType.Method
    public static CharBuffer getCharget(CharBuffer buffer, char[] dsx) {
        return buffer.get(dsx);
    }

    @ZenCodeType.Method
    public static CharBuffer getCharget(CharBuffer buffer, int index, char[] dsx) {
        return buffer.get(index, dsx);
    }

    @ZenCodeType.Method
    public static CharBuffer getChar(CharBuffer buffer, int index, char[] dsx, int length) {
        return buffer.get(dsx, index, length);
    }

    @ZenCodeType.Method
    public static CharBuffer getChar(CharBuffer buffer, int index, char[] dsx, int offset, int length) {
        return buffer.get(index, dsx, offset, length);
    }

    @ZenCodeType.Method
    public static CharBuffer append(CharBuffer buffer, char c) {
        return buffer.append(c);
    }

    @ZenCodeType.Method
    public static CharBuffer append(CharBuffer buffer, CharSequence c) {
        return buffer.append(c);
    }

    @ZenCodeType.Method
    public static CharBuffer append(CharBuffer buffer, CharSequence c, int start, int end) {
        return buffer.append(c, start, end);
    }

    @ZenCodeType.Method
    public static CharBuffer asReadOnlyBuffer(CharBuffer buffer) {
        return buffer.asReadOnlyBuffer();
    }

    @ZenCodeType.Method
    public static CharBuffer clear(CharBuffer buffer) {
        return buffer.clear();
    }

    @ZenCodeType.Method
    public static CharBuffer compact(CharBuffer buffer) {
        return buffer.compact();
    }

    @ZenCodeType.Method
    public static CharBuffer duplicate(CharBuffer buffer) {
        return buffer.duplicate();
    }

    @ZenCodeType.Method
    public static CharBuffer flip(CharBuffer buffer) {
        return buffer.flip();
    }

    @ZenCodeType.Method
    public static CharBuffer limit(CharBuffer buffer, int lim) {
        return buffer.limit(lim);
    }

    @ZenCodeType.Method
    public static CharBuffer mark(CharBuffer buffer) {
        return buffer.mark();
    }

    @ZenCodeType.Method
    public static CharBuffer position(CharBuffer buffer, int newpos) {
        return buffer.position(newpos);
    }

    @ZenCodeType.Method
    public static CharBuffer put(CharBuffer buffer, char c) {
        return buffer.put(c);
    }

    @ZenCodeType.Method
    public static CharBuffer put(CharBuffer buffer, char[] c) {
        return buffer.put(c);
    }

    @ZenCodeType.Method
    public static CharBuffer put(CharBuffer buffer, String str, int start, int end) {
        return buffer.put(str, start, end);
    }

    @ZenCodeType.Method
    public static CharBuffer put(CharBuffer buffer, CharBuffer chr) {
        return buffer.put(chr);
    }

    @ZenCodeType.Method
    public static CharBuffer put(CharBuffer buffer, int index, char c) {
        return buffer.put(index, c);
    }
    @ZenCodeType.Method
    public static CharBuffer put(CharBuffer buffer, int index, char[] c) {
        return buffer.put(index, c);
    }
    @ZenCodeType.Method
    public static CharBuffer put(CharBuffer buffer, char[] c, int offset, int length) {
        return buffer.put(c,offset,length);
    }
    @ZenCodeType.Method
    public static CharBuffer put(CharBuffer buffer, int index, char[] c, int offset, int length) {
        return buffer.put(index, c,offset,length);
    }
    @ZenCodeType.Method
    public static CharBuffer put(CharBuffer buffer, int index, CharBuffer c, int offset, int length) {
        return buffer.put(index, c,offset,length);
    }
    @ZenCodeType.Method
    public static CharBuffer reset(CharBuffer buffer) {
        return buffer.reset();
    }
    @ZenCodeType.Method
    public static CharBuffer rewind(CharBuffer buffer) {
        return buffer.rewind();
    }
    @ZenCodeType.Method
    public static CharBuffer slice(CharBuffer buffer) {
        return buffer.slice();
    }
    @ZenCodeType.Method
    public static CharBuffer slice(CharBuffer buffer, int index, int length) {
        return buffer.slice(index, length);
    }
    @ZenCodeType.Method
    public static CharBuffer subSequence(CharBuffer buffer, int start, int end) {
        return buffer.subSequence(start, end);
    }
    @ZenCodeType.Method
    public static boolean isEmpty(CharBuffer buffer) {
        return buffer.isEmpty();
    }
    @ZenCodeType.Method
    public static char[] array(CharBuffer buffer) {
        return buffer.array();
    }
    @ZenCodeType.Method
    public static int arrayOffset(CharBuffer buffer) {
        return buffer.arrayOffset();
    }
}
