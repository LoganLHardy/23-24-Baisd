import java.util.Scanner;

public class Menu {

        Astronaut astro = new Astronaut();
        Spacecraft craft = new Spacecraft();

            System.out.println("Welcome to the universal space program");
            System.out.println("Please write down this password");
            System.out.println(password);
            System.out.println("Enter your password to confirm it");
            input = keyboard.nextLine();

public void displayMenu() {
        while(menuChoice != 8) {
            System.out.println("Welcome to the universal space program");
            System.out.println("Please enter your password");
            input = keyboard.nextLine();

            System.out.println("Please select one of these options");
            System.out.println("1. Access astronaut information");
            System.out.println("2. Add or Remove an astronaut");
            System.out.println("3. Edit astronaut information");
            System.out.println("4. Access spacecraft information");
            System.out.println("5. Add or Remove a spacecraft");
            System.out.println("6. Edit spacecraft information");
            System.out.println("7. Start launch process");
            System.out.println("8. Exit the program");
            menuChoice = keyboard.nextInt();

            if(menuChoice == 1) {
                while(astroChoice != 1) {
                    System.out.println("Which astronaut would you like see");
                    System.out.println("1. Return to main menu");
                    System.out.println(astronaut);
                    astroChoice = keyboard.nextInt();

                        if(astroChoice == 1) {
                            break;
                        }
                        if(astroChoice == ) {
                            System.out.println(astronaut);
                        }

                        while(choice != 11) {
                            System.out.println("Please choose which information you want to see");
                            System.out.println("1. Astronaut name");
                            System.out.println("2. Date of birth");
                            System.out.println("3. Serial number");
                            System.out.println("4. Physical address");
                            System.out.println("5. Email address");
                            System.out.println("6. Phone number");
                            System.out.println("7. Pay rate");
                            System.out.println("8. Weight");
                            System.out.println("9. Next of kin");
                            System.out.println("10. Status");
                            System.out.println("11. Return");
                            choice = keyboard.nextInt();

                            if(choice == 1) {
                                System.out.println(astro.name);
                            }
                            if(choice == 2) {
                                System.out.println(astro.birthDate);
                            }
                            if(choice == 3) {
                                System.out.println(astro.serial);
                            }
                            if(choice == 4) {
                                System.out.println(astro.address);
                            }
                            if(choice == 5) {
                                System.out.println(astro.email);
                            }
                            if(choice == 6) {
                                System.out.println(astro.phone);
                            }
                            if(choice == 7) {
                                System.out.println(astro.payRate);
                            }
                            if(choice == 8) {
                                System.out.println(astro.weight);
                            }
                            if(choice == 9) {
                                System.out.println(astro.nextKin);
                            }
                            if(choice == 10) {
                                System.out.println(astro.status);
                            }
                            if(choice == 11) {
                                break;
                            }
                        }

                    }
                }

            if(menuChoice == 2) {
                while(choice != 3) {
                    System.out.println("Please choose whether you want to add or remove an astronaut");
                    System.out.println("1. Add a new astronaut");
                    System.out.println("2. Remove an existing astronaut");
                    System.out.println("3. Return to main menu");
                    choice = keyboard.nextInt();

                    if(choice == 1) {
                        System.out.println();
                    }
                    if(choice == 2) {
                        System.out.println("Which astronaut would you like to remove");
                        System.out.println("1. Return");
                        System.out.println(astronaut);
                        astroChoice = keyboard.nextInt();
                            if(astroChoice == 1) {
                                break;
                            }
                            if(astroChoice == ) {
                                System.out.println(astronaut);
                            }
                    }
                    if(choice == 3) {
                        break;
                    }
                }
            }

            if(menuChoice == 3) {
                while(astroChoice != 1) {
                    System.out.println("Which astronaut would you like edit");
                    System.out.println("1. Return to main menu");
                    System.out.println(astronaut);
                    astroChoice = keyboard.nextInt();

                        if(astroChoice == 1) {
                            break;
                        }
                        if(astroChoice == ) {
                            System.out.println(astronaut);
                        }

                        while(choice != 11) {
                            System.out.println("Please choose which information you want to edit");
                            System.out.println("1. Astronaut name");
                            System.out.println("2. Date of birth");
                            System.out.println("3. Serial number");
                            System.out.println("4. Physical address");
                            System.out.println("5. Email address");
                            System.out.println("6. Phone number");
                            System.out.println("7. Pay rate");
                            System.out.println("8. Weight");
                            System.out.println("9. Next of kin");
                            System.out.println("10. Status");
                            System.out.println("11. Return");
                            choice = keyboard.nextInt();

                            if(choice == 1) {
                                System.out.println(astro.name);
                                astro.name = keyboard.nextLine();
                            }
                            if(choice == 2) {
                                System.out.println(astro.birthDate);
                                astro.birthDate = keyboard.nextInt();
                            }
                            if(choice == 3) {
                                System.out.println(astro.serial);
                                astro.serial = keyboard.nextInt();
                            }
                            if(choice == 4) {
                                System.out.println(astro.address);
                                astro.address = keyboard.nextLine();
                            }
                            if(choice == 5) {
                                System.out.println(astro.email);
                                astro.email = keyboard.nextLine();
                            }
                            if(choice == 6) {
                                System.out.println(astro.phone);
                                astro.phone = keyboard.nextInt();
                            }
                            if(choice == 7) {
                                System.out.println(astro.payRate);
                                astro.payRate = keyboard.nextDouble();
                            }
                            if(choice == 8) {
                                System.out.println(astro.weight);
                                astro.weight = keyboard.nextDouble();
                            }
                            if(choice == 9) {
                                System.out.println(astro.nextKin);
                                astro.nextKin = keyboard.nextLine();
                            }
                            if(choice == 10) {
                                System.out.println(astro.status);
                                astro.status = keyboard.nextLine();
                            }
                            if(choice == 11) {
                                break;
                            }
                        }
                }
            }

            if(menuChoice == 4) {
                while(craftChoice != 1) {
                    System.out.println("Which spacecraft would you like see");
                    System.out.println("1. Return to main menu");
                    System.out.println(spacecraft);
                    craftChoice = keyboard.nextInt();

                        if(craftChoice == 1) {
                            break;
                        }
                        if(craftChoice == ) {
                            System.out.println(spacecraft);
                        }

                        while(choice != 4) {
                            System.out.println("Please choose which information you want to see");
                            System.out.println("1. Spacecraft name");
                            System.out.println("2. Fuel tank capacity");
                            System.out.println("3. Fuel level");
                            System.out.println("4. Return to main menu");
                            choice = keyboard.nextInt();

                            if(choice == 1) {
                                System.out.println(craft.spacecraftName);
                            }
                            if(choice == 2) {
                                System.out.println(craft.fuelTank);
                            }
                            if(choice == 3) {
                                System.out.println(craft.fuelLevel);
                            }
                            if(choice == 4) {
                                break;
                            }
                        }
                }
            }

            if(menuChoice == 5) {
                while(choice != 3) {
                    System.out.println("Please choose whether you want to add or remove a spacecraft");
                    System.out.println("1. Add a new spacecraft");
                    System.out.println("2. Remove an existing spacecraft");
                    System.out.println("3. Return to main menu");
                    choice = keyboard.nextInt();

                    if(choice == 1) {
                        System.out.println();
                    }
                    if(choice == 2) {
                        System.out.println("Which spacecraft would you like to remove");
                        System.out.println("1. Return");
                        System.out.println(spacecraft);
                        craftChoice = keyboard.nextInt();
                            if(craftChoice == 1) {
                                break;
                            }
                            if(craftChoice == ) {
                                System.out.println(spacecraft);
                            }
                    }
                    if(choice == 3) {
                        break;
                    }
                }
            }

            if(menuChoice == 6) {
                while(craftChoice != 1) {
                    System.out.println("Which spacecraft would you like see");
                    System.out.println("1. Return to main menu");
                    System.out.println(spacecraft);
                    craftChoice = keyboard.nextInt();

                        if(craftChoice == 1) {
                            break;
                        }
                        if(craftChoice == ) {
                            System.out.println(spacecraft);
                        }

                        while(choice != 4) {
                            System.out.println("Please choose which information you want to edit");
                            System.out.println("1. Spacecraft name");
                            System.out.println("2. Fuel tank capacity");
                            System.out.println("3. Fuel level");
                            System.out.println("4. Return");
                            choice = keyboard.nextInt();

                            if(choice == 1) {
                                System.out.println(craft.spacecraftName);
                                craft.spacecraftName = keyboard.nextLine();
                            }
                            if(choice == 2) {
                                System.out.println(craft.fuelTank);
                                craft.fuelTank = keyboard.nextDouble();
                            }
                            if(choice == 3) {
                                System.out.println(craft.fuelLevel);
                                craft.fuelLevel = keyboard.nextDouble();
                            }
                            if(choice == 4) {
                                break;
                            }
                        }
                }
            }

            if(menuChoice == 7) {
                while(choice != 2) {
                    System.out.println("Would you like to begin the launch sequence?");
                    System.out.println("1. Yes");
                    System.out.println("2. No, return to main menu");
                    choice = keyboard.nextInt();

                    if(choice == 1) {
                        //ascent
                    }
                    if(choice == 2) {
                        break;
                    }
                }
            }

            if(menuChoice == 8) {
                while(choice != 2) {
                    System.out.println("Are you sure you would like to log out and exit?");
                    System.out.println("1. Yes");
                    System.out.println("2. No, return to the main menu");
                    choice == keyboard.nextInt();

                    if(choice == 1) {
                        System.out.println("Thank you for being a part of the universal space program and have a nice day!");
                        System.exit(0);
                    }
                    if(choice == 2) {
                        break;
                    }
                }
            }

        }
    }
}