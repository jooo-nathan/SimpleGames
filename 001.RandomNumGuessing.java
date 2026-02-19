import java.util.Scanner;
//import java.util.Random;

public class RandomNumGuessing {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int maxNum = 0, chance = 0, randomNum = 0, guessNum = 0;
		String rep = "oi", pilGame = "4", pilRules = "2";

		System.out.println("\n====================");
		System.out.println("| Game Tebak Angka |");
                System.out.println("====================");

		do {
			do {
				System.out.println("\nPilihan Game :");
				System.out.println("1. 1 - 10");
				System.out.println("2. 1 - 100");
				System.out.println("3. 1 - 1000");

				System.out.print("\nMau pilih yamg mana nih? : ");
				pilGame = sc.nextLine();

				if (pilGame.equals("1") || pilGame.equals("2") || pilGame.equals("3")) {
                                        break;
                                }

				else {
					System.out.println("\u001b[31m\n[ !!! ]  E  R  R  O  R  [ !!! ]");
					System.out.println(" > > >   Invalid Input   < < < ");
					System.out.println("[ Please re-enter your input! ]\u001b[0m");
				}

			} while (!pilGame.equals("1") || !pilGame.equals("2") || !pilGame.equals("3"));

			System.out.println("\nKamu memilih game ke-" + pilGame + " !");

			do {
				System.out.println("\nBaca aturan sebelum memulai!");
				System.out.println("0. Baca Aturan");
				System.out.println("1. Mulai Game");
				System.out.print("\nMasukkan pilihan kamu : ");

				pilRules = sc.nextLine();

				if (pilRules.equals("0")) {

					if (pilGame.equals("1")) {
						System.out.println("\n=======================");
						System.out.println("| ATURAN GAME PERTAMA |");
						System.out.println("=======================");
						break;
					}
					else if (pilGame.equals("2")) {
						System.out.println("\n=====================");
						System.out.println("| ATURAN GAME KEDUA |");
						System.out.println("=====================");
						break;
					}
					else if (pilGame.equals("3")) {
						System.out.println("\n======================");
                        System.out.println("| ATURAN GAME KETIGA |");
						System.out.println("======================");
						break;
                                        }
				}

				else if (pilRules.equals("1")) {
					break;
				}
				else {
                                        System.out.println("\u001b[31m\n[ !!! ]  E  R  R  O  R  [ !!! ]");
                                        System.out.println(" > > >   Invalid Input   < < < ");
                                        System.out.println("[ Please re-enter your input! ]\u001b[0m");
                                }

			} while (!pilRules.equals("0") || !pilRules.equals("1"));

			if (pilRules.equals("0")) {
				System.out.println("Aturan adalah sebagai berikut.\n");
				System.out.println("Aku akan memilih suatu angka");
				System.out.print("secara acak dari ");

				if (pilGame.equals("1")) {
					System.out.println("1 sampai 10.");
				}
				else if (pilGame.equals("2")) {
					System.out.println("1 sampai 100.");
				}
				else if (pilGame.equals("3")) {
                                        System.out.println("1 sampai 1000.");
				}

				System.out.println("\nSetiap kamu menebak, aku akan memberi clue");
				System.out.println("apakah tebakanmu lebih atau kurang dari angkaku.\n");

				System.out.print("Kamu hanya memiliki ");

				if (pilGame.equals("1")) {
                                        System.out.print("3");
                                }
                                else if (pilGame.equals("2")) {
                                        System.out.print("6");
                                }
                                else if (pilGame.equals("3")) {
                                        System.out.print("10");
                                }

				System.out.println(" kesempatan menebak.");

				do {
					System.out.println("\nJadii.. Apakah kamu sudah siap?");
					System.out.print("Ketik '1' bila sudah siap : ");
					pilRules = sc.nextLine();

					if (pilRules.equals("1")) {
						System.out.println("\nBaiklah, mari kita mulai");
						break;
					}
					else {
						System.out.println("\u001b[31m\n[ !!! ]  E  R  R  O  R  [ !!! ]");
        	                                System.out.println(" > > >   Invalid Input   < < < ");
	                                        System.out.println("[ Please re-enter your input! ]\u001b[0m");
					}

				} while (!pilRules.equals("1"));
			}

			if (pilRules.equals("1")) {
				System.out.println("\n=================================================");
				System.out.println("Permainan dimulai!\n");
				System.out.print("Aku sudah memilih suatu angka dari ");

				if (pilGame.equals("1")) {
                                        System.out.println("1 sampai 10");
                                }
                                else if (pilGame.equals("2")) {
                                        System.out.println("1 sampai 100");
                                }
                                else if (pilGame.equals("3")) {
                                        System.out.println("1 sampai 1000");
                                }

				if (pilGame.equals("1")) {
                                	maxNum = 11;
					chance = 3;
                                }
                                else if (pilGame.equals("2")) {
                                        maxNum = 101;
					chance = 6;
                                }
                                else if (pilGame.equals("3")) {
                                        maxNum = 1001;
					chance = 10;
                                }

				System.out.println("Ingat! Kamu hanya memiliki " + chance + " kesempatan!");

				// RANDOMING NUMBERS
                do {
                    randomNum = (int) (Math.random() * maxNum);
                } while (randomNum == 0);
				

				// GUESSING
				for (int i = 1; i <= chance; i++) {
					System.out.print("\nMasukkan tebakanmu : ");
					guessNum = sc.nextInt();

					if (guessNum == randomNum) {
						System.out.println("\nSelamat! Kamu benar!");
						System.out.println("Aku memang memilih angka " + randomNum + "!");
						break;
					}
					else if ((guessNum > randomNum) && (i != chance)) {
						System.out.println("\nKebesaran tuh!");
					}
					else if ((guessNum < randomNum) && (i != chance)) {
						System.out.println("\nKekecilan bro!");
					}

					if (i == chance-1) {
						System.out.print("Ini kesempatan terakhirmu!\n");
					}
					else if (i != chance) {
						System.out.print("Kesempatanmu sisa " + (chance - i) + " nih!\n");
					}
				}

				if (guessNum != randomNum) {
					System.out.println("\n\nYah, sayang sekali. Kamu gagal menebak!");
                    System.out.println("Angkaku adalah " + randomNum);
				}

			}

			sc.nextLine();

			do {
				System.out.print("\nApakah kamu mau bermain lagi [Ya / Tidak] ? : ");

				rep = sc.nextLine();

				if (rep.equalsIgnoreCase("Tidak")) {
					System.out.println("\nTerima kasih sudah memainkan permainankuu!\n");
					break;
				}
				else if (rep.equalsIgnoreCase("Ya")) {
					break;
				}
				else {
					System.out.println("\u001b[31m\n[ !!! ]  E  R  R  O  R  [ !!! ]");
                	                System.out.println(" > > >   Invalid Input   < < < ");
                        	        System.out.println("[ Please re-enter your input! ]\u001b[0m");
				}

			} while (!rep.equalsIgnoreCase("Ya") || !rep.equalsIgnoreCase("Tidak"));

		} while (rep.equalsIgnoreCase("Ya"));
	}
}