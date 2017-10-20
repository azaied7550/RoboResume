package com.company;

import java.util.ArrayList;
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {

                // Prepare to accept user input
                Scanner Keyboard = new Scanner(System.in);

                Person newPerson = new Person();
                Education newEducation;
                Experience newExperience;
                Skill newSkill;
                Duty newDuty;
                String answer = " ";


                ArrayList<Person> personList = new ArrayList<>();
                ArrayList<Education> educationList = new ArrayList<>();
                ArrayList<Experience> experienceList = new ArrayList<>();
                ArrayList<Skill> skillList = new ArrayList<>();

                // Entering personal info
                System.out.println("Enter first name  : ");
                newPerson.setFirstName(Keyboard.nextLine());
                System.out.println("Enter last name  : ");
                newPerson.setLastName(Keyboard.nextLine());
                System.out.println("Enter email address : ");
                newPerson.setEmail(Keyboard.nextLine());
                personList.add(newPerson);


                do {
                    newEducation = new Education();

                    System.out.println("Education: ");
                    System.out.println("Enter Degree (BS, MS, Phd,...: ");
                    newEducation.setDegree(Keyboard.nextLine());
                    System.out.println("Enter Major: ");
                    newEducation.setMajor(Keyboard.nextLine());
                    System.out.println("Enter University name: ");
                    newEducation.setUniversity(Keyboard.nextLine());
                    System.out.println("Enter year of graduation: ");
                    newEducation.setDate(Keyboard.nextInt());
                    Keyboard.nextLine();

                    // Prompting user for a new entry
                    System.out.println("(A)dd education or move to (N)ext? ");
                    answer = Keyboard.nextLine();
                    educationList.add(newEducation);
                } while (answer.equalsIgnoreCase("A"));


                do {
                    newExperience = new Experience();
                    System.out.println("Work Experience: ");
                    System.out.println("Enter Position: ");
                    newExperience.setPosition(Keyboard.nextLine());
                    System.out.println("Enter company name: ");
                    newExperience.setCompany(Keyboard.nextLine());
                    System.out.println("Enter dates(Month YYYY-Month YYYY): ");
                    newExperience.setDates(Keyboard.nextLine());

                    String dutyAnswer = "";

                    //Adding duties
                    do {
                        newDuty = new Duty();
                        System.out.println("Enter duties:");
                        newDuty.setDuty(Keyboard.nextLine());
                        newExperience.getDutyList().add(newDuty);

                        System.out.println("(A)dd another duty of move to (N)ext? ");
                        dutyAnswer = Keyboard.nextLine();

                    } while (dutyAnswer.equalsIgnoreCase("A"));

                    System.out.println("(A)dd experience or move to (N)ext? ");
                    answer = Keyboard.nextLine();

                    experienceList.add(newExperience);

                } while (answer.equalsIgnoreCase("A"));


                do {
                    newSkill = new Skill();

                    System.out.println("Enter skills  : ");
                    newSkill.setSkill(Keyboard.nextLine());
                    System.out.println("Enter ratings (highly skilled, proficient, familiar): ");
                    newSkill.setRating(Keyboard.nextLine());
                    skillList.add(newSkill);
                    System.out.println("(A)dd skills or move to (N)ext? ");
                    answer = Keyboard.nextLine();

                } while (answer.equalsIgnoreCase("A"));


                System.out.println("========================================================");

                //Displaying personal info
                for (Person eachPerson : personList) {
                    System.out.println(eachPerson.getFirstName() + " " + eachPerson.getLastName());
                    System.out.println(eachPerson.getEmail());
                    System.out.println();
                }

                //Displaying education
                System.out.println("Education");
                for (Education eachEducation : educationList) {
                    System.out.println(eachEducation.getDegree() + " in " + eachEducation.getMajor()+",");
                    System.out.println(eachEducation.getUniversity() + ", " + eachEducation.getDate());
                    System.out.println();
                }

                //Displaying experience
                System.out.println("Experience");
                for (Experience eachExperience : experienceList) {
                    System.out.println(eachExperience.getPosition());
                    System.out.println(eachExperience.getCompany() + ", " + eachExperience.getDates());

                    int count =1;
                    for (Duty eachDuty:eachExperience.getDutyList()){
                        System.out.println("-Duty "+count+ ", "+eachDuty.getDuty());
                        count++;
                    }
                    System.out.println();
                }

                //Displaying skills
                System.out.println("Skills");
                for (Skill eachSkill : skillList) {
                    System.out.println(eachSkill.getSkill() + ", " + eachSkill.getRating());

                }

                Keyboard.close();
            }
}