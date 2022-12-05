package com.rafly.bealty.Listeners;

import com.rafly.bealty.Models.RandomRecipeApiResponse;

public interface RandomRecipeResponseListener {
    void didFetch(RandomRecipeApiResponse response, String message);
    void didError(String message);
    }

