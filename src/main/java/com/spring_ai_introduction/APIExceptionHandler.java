package com.spring_ai_introduction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.openai.api.common.OpenAiApiClientErrorException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class APIExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(APIExceptionHandler.class);

    private static final String LLM_COMMUNICATION_ERROR =
            "Error occuered while communicating with the configured LLM. Please try again later.";

    public ProblemDetail handle(OpenAiApiClientErrorException exception) {
        logger.error("OpenAI returned an error.", exception);
        return ProblemDetail.forStatusAndDetail(
                HttpStatus.SERVICE_UNAVAILABLE, LLM_COMMUNICATION_ERROR);
    }
}
