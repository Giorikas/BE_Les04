abstract public class Arena {
        //VARS
        private String arenaName;
        private int maxPlayers;
        //CSONST
        public Arena(String arenaName, int maxPlayers){
                this.arenaName = arenaName;
                this.maxPlayers = maxPlayers;
        }
        //GETTERS
        public int getMaxPlayers(){
                return maxPlayers;
        }
        public String getArenaName(){return arenaName;}
        //SETTERS
        public void setArenaName(String arenaName){
                this.arenaName = arenaName;
        }
        public void setMaxPlayers(int maxPlayers){
                this.maxPlayers = maxPlayers;
        }

}
