package com.company;

public class PhoneParameters {
    class core {
        String core = "Switched off";
        String coreType = "IntelCore";

        public void working() {
            core = "working";
            System.out.println("Core is " + core);
        }

        public void notworking() {
            core = "not working";
            System.out.println("Core is " + core);
        }
    }

    class memory {
        String memory = "Switched off";

        public void working() {
            memory = "Working";
            System.out.println("Memory is " + memory);
        }

        public void notworking() {
            memory = "not working";
            System.out.println("Memory is " + memory);
        }
    }

    class camera {
        String camera = "Switched off";

        public void working() {
            camera = "Working";
            System.out.println("Camera is " + camera);
        }

        public void notworking() {
            camera = "not working";
            System.out.println("Camera is " + camera);
        }
    }
    core IntelCore = new core();
    memory RAM = new memory();
    camera CAM = new camera();
}