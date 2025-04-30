package challengequestions;

import java.util.Comparator;



class Checker implements Comparator<Player> {
    
        @Override
        public int compare(Player p1, Player p2){
            
            Player a = (Player) p1;
            Player b = (Player) p2;
            
            if (a.score < b.score) return 1;
            if (a.score > b.score) return -1;

            if (a.score == b.score) {
                return a.name.compareTo(b.name);
            }
               
            return 0;
            
        }
    }


