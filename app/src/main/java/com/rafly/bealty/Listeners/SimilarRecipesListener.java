package com.rafly.bealty.Listeners;

import com.rafly.bealty.Models.SimilarReciperesponse;

import java.util.List;

public interface SimilarRecipesListener {
    void didFetch(List<SimilarReciperesponse> response, String message);
    void didError(String message);
}
