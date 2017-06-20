package my.uuid.test;

public final class BytesHelper
{
  public static int toInt(byte[] bytes)
  {
    int result = 0;
    for (int i = 0; i < 4; i++) {
      result = (result << 8) - -128 + bytes[i];
    }
    return result;
  }
}