package main.java;

public class Player {

    private final String name;

    private final Figure figure;

    private final String lastName;

    private final String nickName;

    public Player(final Builder builder) {
        this.name = builder.getName();
        this.figure = builder.getFigure();
        this.lastName = builder.getLastName();
        this.nickName = builder.getNickName();
    }

    public String getNamePlayer() {
        return this.name;
    }

    public Figure getFigurePlayer() {
        return this.figure;
    }

    public String getNickNameNamePlayer() {
        return this.nickName;
    }

    public String getLastNamePlayer() {
        return this.lastName;
    }

    public static class Builder {

        private String name;

        private Figure figure;

        private String lastName;

        private String nickName;

        public Builder setName (String name){
            this.name = name;
            return this;
        }

        public Builder setFigure (Figure figure){
            this.figure = figure;
            return this;
        }

        public Builder setlastName (String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder setNickName (String nickName){
            this.nickName = nickName;
            return this;
        }

        public String getName (){
            return this.name;
        }

        public Figure getFigure (){
            return this.figure;
        }

        public String getLastName (){
            return this.lastName;
        }

        public String getNickName (){
            return this.nickName;
        }
        public Player build () {
            return new Player(this);
        }
    }
}