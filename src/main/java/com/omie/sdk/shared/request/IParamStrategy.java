package com.omie.sdk.shared.request;

import java.util.Map;

public interface IParamStrategy {
    Map<String, Object> buildParams(Integer page, Integer size, String importedApi, Map<String, Object> params);
}
