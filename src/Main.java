import decorator.DelayTaskRunner;
import decorator.PrinterTaskRunner;
import decorator.StrategyTaskRunner;
import decorator.TaskRunner;
import model.MessageTask;
import model.Strategy;

import java.time.LocalDateTime;




public class Main {


    public static MessageTask[] createMessages(){

        MessageTask messageTask1 = new MessageTask("1",
                "Feedback la MAP",
                "Esti foarte bun1",
                "Profa",
                "Student",
                LocalDateTime.now());
        MessageTask messageTask2 = new MessageTask("2",
                "Feedback la MAP",
                "Esti foarte bun2",
                "Profa",
                "Student",
                LocalDateTime.now());

        MessageTask messageTask3 = new MessageTask("3",
                "Feedback la MAP",
                "Esti foarte bun3",
                "Profa",
                "Student",
                LocalDateTime.now());


//        MessageTask[] res=new MessageTask[]{
//                messageTask1,messageTask2,messageTask3
//        };
        MessageTask[] res={messageTask1,messageTask2,messageTask3};



        return res;




    }
    public static void test(MessageTask[] messages,String strategy){
        TaskRunner runner = new StrategyTaskRunner(Strategy.valueOf(strategy));
        TaskRunner runner2 = new StrategyTaskRunner(Strategy.valueOf(strategy));
        TaskRunner runner3 = new StrategyTaskRunner(Strategy.valueOf(strategy));
        for (MessageTask t:messages) {
            runner.addTask(t);
            runner2.addTask(t);
            runner3.addTask(t);
        }
        //runner.executeAll(
        runner.executeAll();
        new DelayTaskRunner(runner2).executeAll();
        new PrinterTaskRunner(runner3).executeAll();
    }
    public static void main(String[] args) {
        MessageTask[] messages = createMessages();
        test(messages,args[0]);
        //        MessageTask messageTask = new MessageTask("1",
//                "Feedback la MAP",
//                "Esti foarte bun",
//                "Profa",
//                "Student",
//                LocalDateTime.now());
        // System.out.println(messageTask.toString());
        //messageTask.execute();
       // messages[0] = messageTask;
       // System.out.println(messages.length);

    }
}
