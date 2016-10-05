package refactoring;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String input = "b";
        String output = "";

//        if (input.equals("a")) {
//            output = new SimpleProcessor1().process(input);
//        } else if (input.equals("b")) {
//            output = new SimpleProcessor2().process(input);
//        }

        Provider<ProcessorRepository> provider = new ProcessorRepositoryProvider();
        // This example just demonstrate provider usage.
        // In general it would be better to use ProcessorRepository directly (as dependency to somewhere)

        ProcessorRepository processorRepository = provider.get();

        DataProcessor processor = processorRepository.get(input);

        output = processor.process(input);

        System.out.println(output);
    }

    interface Provider<T> {
        T get();
    }

    static class ProcessorRepositoryProvider implements Provider<ProcessorRepository> {
        @Override
        public ProcessorRepository get() {
            return new ProcessorRepository() {
                private Map<String, DataProcessor> processors = new HashMap<String, DataProcessor>() {{
                    put("a", new SimpleProcessor1());
                    put("b", new SimpleProcessor2());
                }};

                @Override
                public DataProcessor get(String input) {
                    return processors.get(input);
                }
            };
        }
    }

    interface ProcessorRepository {
        DataProcessor get(String input);
    }

//    static class InMemoryProcessorRepository implements ProcessorRepository {
//        private Map<String, DataProcessor> processors = new HashMap<String, DataProcessor>() {{
//            put("a", new SimpleProcessor1());
//            put("b", new SimpleProcessor2());
//        }};
//
//        @Override
//        public DataProcessor get(String input) {
//            return processors.get(input);
//        }
//    }
}
