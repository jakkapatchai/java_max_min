class x {
  public static void main (String args[]) {
    double total = 0 ; 
    for (int i = 0 ; i < args.length ; i++) {
      total += Double.parseDouble(args[i]); 
    }
    System.out.println(total);
  }
}