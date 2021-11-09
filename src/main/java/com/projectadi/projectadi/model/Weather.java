package com.projectadi.projectadi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Weather {
        public String main;
        public String description;

        public String getMain() {
                return main;
        }

        public void setMain(String main) {
                this.main = main;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }
}
