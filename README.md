Spring AI is a Spring-native framework that makes it easy to plug AI capabilities (chat, embeddings, image generation, speech, moderation, RAG, tools/“function calling”, memory, evals) into Java apps—using the same idioms you already know (autoconfiguration, starters, POJOs, fluent clients). It focuses on portability across model and vector-store providers so you’re not locked in.



Key building blocks (the 80/20)

ChatClient – fluent API to call chat models (sync or streaming). 
Structured outputs – map model replies directly into POJOs. 
Advisors – pluggable “middleware” for prompts (system instructions, output parsing, safety, etc.). 
Memory – conversation history abstractions. 
RAG – unified interfaces for document ingestion and retrieval (ETL readers + vector stores like PGVector, Pinecone, Redis, etc.). 
Model & vector portability – OpenAI, Anthropic, Azure/OpenAI, AWS Bedrock, Google, Ollama, and many vector DBs. 
Boot starters – drop-in dependencies and autoconfig to get running quickly. 
