class RecursiveQueueTest  {
    public static void main(String[] args) {

        RecursiveQueueTest rqt = new RecursiveQueueTest();
        rqt.start();
    }

    public void start(){
        RecursiveQueue<String> rs = new RecursiveQueue<String>();
        String command = "";
        printHelp();

        while(!command.equals("q")){
            System.out.println("Type a command or a text to be saved");
            command = System.console().readLine();
            switch (command) {
                case "get":
                    rs.get();
                    break;
                case "pa":
                    rs.printAll();
                    break;
                case "pad":
                    rs.printAllDesc();
                    break;
                case "pf":
                    rs.printFirst();
                    break;
                case "pl":
                    rs.printLast();
                    break;
                case "?": 
                    printHelp(); 
                    break;
                case "q": 
                    break;
                default:
                    rs.add(command); 
                    break;
            }
        }
    }

    private void printHelp(){
        System.out.println("List of commands:");
        System.out.println(" pa  -> print all");
        System.out.println(" pad  -> print all desc");
        System.out.println(" pf  -> print first");
        System.out.println(" pl  -> print last");
        System.out.println(" get -> remove from the queue");
        System.out.println(" q   -> quit the application");
        System.out.println(" ?   -> help");
        System.out.println(" or type what you want to be saved");
    }
}

/*
public class GuessGame{
    Player p[] = {new Player(), new Player(), new Player()};

    public void startGame(){

        int targetNumber = (int) (Math.random()*10);
        boolean hasWinner = false;
        System.out.println("I'm thinking of a number between 0 and 9...'");

        while(!hasWinner){
            System.out.println("Number to guess is "+targetNumber);
            for(int i = 0; i<p.length; i++){
                System.out.println("Player "+(i+1)+" guessed " + p[i].guess());
                hasWinner = (targetNumber==p[i].getGuess())?true:hasWinner;
            }

        
            if(hasWinner){
                System.out.println("We have a winner ");
                for(int i = 0; i<p.length; i++){
                    if(targetNumber==p[i].getGuess()){
                        System.out.println("Congratulations player "+(i+1)+", you guessed correctly  "+p[i].getGuess());
                    }else{
                        System.out.println("Player "+(i+1)+", guessed wrongly  "+p[i].getGuess());
                    }
                }
            }else{
                System.out.println("Players will have to try again! ");
                System.out.println("..... ");
            }
        }
    }
}
*/