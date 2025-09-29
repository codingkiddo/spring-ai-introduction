package com.spring_ai_introduction;

import java.util.Map;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.stereotype.Service;

@Service
public class PoetryService {

    private static final PromptTemplate PROMPT_TEMPLATE =
            new PromptTemplate(
                    "Write a {genre} haiku about {theme} following the traditional 5-7-5 syllable structure.");

    private final ChatClient chatClient;

    PoetryService(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    public Poem generate(String genre, String theme) {

        Prompt prompt = PROMPT_TEMPLATE.create(Map.of("genre", genre, "theme", theme));
        return chatClient.prompt(prompt).call().entity(Poem.class);
    }
}
