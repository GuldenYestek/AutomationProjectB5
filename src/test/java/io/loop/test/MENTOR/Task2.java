package io.loop.test.MENTOR;

public class Task2 {


        public static String getBuildingAddress (String buildingInput, String [] buildingNames, String [] buildingAddresses){


            for (int i = 0; i <buildingNames.length ; i++) {
                if (!buildingInput.equalsIgnoreCase(buildingNames[i])) {
                    continue;
                } else {
                    int index = i;
                    return buildingAddresses[index];
                }
            }
            return "Building is not in the database.";
        }

        public static void main(String[] args) {
            String[] names = {
                    "GrandTower",
                    "SummitHall",
                    "RiverHouse",
                    "HarborView",
                    "MapleCourt"
            };
            String[] addresses = {
                    "123 Main St",
                    "456 Hill Rd",
                    "789 River Ln",
                    "101 Harbor Blvd",
                    "202 Maple Ave"
            };

            System.out.println(getBuildingAddress("HarborView", names, addresses));

        }

    }



