package edu.iitu.kz;
import org.springframework.stereotype.Component;
@Component
public class DBConnection {
        String welcomemsg;

        public void init() {
            System.out.println("init method");
        }

        public void destroy() {
            System.out.println("destroy method");
        }

        public String getWelcomemsg() {
            return welcomemsg;
        }

        public void setWelcomemsg(String welcomemsg) {
            this.welcomemsg = welcomemsg;
        }
    }

