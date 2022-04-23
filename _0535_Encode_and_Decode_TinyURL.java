// https://leetcode.com/problems/encode-and-decode-tinyurl/

import java.util.*;
public class _0535_Encode_and_Decode_TinyURL {
    public static void main(String[] args) {
        String longUrl = "https://leetcode.com/problems/design-tinyurl";
        
        Codec obj = new Codec();
        String encodString = obj.encode(longUrl);
        System.out.println("ENCODED : "+encodString);
        System.out.println("DECODED : "+obj.decode(encodString));
    }
}


class Codec {
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl)
    {
        StringBuilder url = new StringBuilder(longUrl);
        for(int i = 0; i < url.length(); i++)
        {
            char ch = (char)(url.charAt(i)^url.length());
            url.replace(i,i+1, Character.toString(ch));          
        }    
        return url.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        StringBuilder url = new StringBuilder(shortUrl);
        for(int i = 0; i < url.length(); i++)
        {
            char ch = (char)(url.charAt(i)^url.length());
            url.replace(i,i+1, Character.toString(ch));          
        }    
        return url.toString();
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));