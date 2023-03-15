class TimSepakbola {

  // Assume there are only 2 teams using this class!

  // Attribute
  String nama;
  int skor;
  boolean isOnMatch;

  // Default constructor
  TimSepakbola() {
    nama = "[NAMA]";
    skor = 0;
    isOnMatch = false;
  }

  // Overloading constructor
  TimSepakbola(String nama) {
    this.nama = nama;
    skor = 0;
    isOnMatch = false;
  }

  void startTandingBola(TimSepakbola lawan) {
    // DO NOT change both if conditions
    if (isOnMatch) {
      System.out.println("Tim " + nama + " sedang dalam pertandingan!");
      return;
    }

    if (lawan.isOnMatch) {
      System.out.println("Lawan sedang dalam pertandingan!");
      return;
    }

    System.out.println(
      "Pertandingan antara " + nama + " dan " + lawan.nama + " dimulai!\n"
    );
    setIsOnMatch(true);
    lawan.setIsOnMatch(true);
  }

  void goal() {
    // DO NOT change the if condition
    if (!isOnMatch) {
      System.out.println(
        "Tim " + nama + " TIDAK sedang dalam pertandingan!"
      );
      return;
    }

    skor++;
  }

  int getSkor() {
    // DO NOT change the if condition
    if (!isOnMatch) {
      System.out.println(
        "Tim " + nama + " TIDAK sedang dalam pertandingan!"
      );
      return 0;
    }

    return skor;
  }

  void setIsOnMatch(boolean onMatch) {
    this.isOnMatch = onMatch;
  }

  void endTandingBola(TimSepakbola lawan) {
    // DO NOT change the if condition
    if (!isOnMatch && !lawan.isOnMatch) {
      System.out.println("Kedua tim TIDAK sedang dalam pertandingan");
      return;
    }

    System.out.println(
      "\nPertandingan antara " +
      nama +
      " dan " +
      lawan.nama +
      " selesai!\n"
    );
    setIsOnMatch(false);
    lawan.setIsOnMatch(false);
  }
}