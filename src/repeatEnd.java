public class repeatEnd {
  public String repeatEnd(String str, int n) {
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < n; i++) {
      result.append(str.substring(str.length() - n, str.length()));
    }
    return result.toString();
  }
}
