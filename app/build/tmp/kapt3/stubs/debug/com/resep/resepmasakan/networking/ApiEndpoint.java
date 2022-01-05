package com.resep.resepmasakan.networking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lcom/resep/resepmasakan/networking/ApiEndpoint;", "", "()V", "BASEURL", "", "getBASEURL", "()Ljava/lang/String;", "setBASEURL", "(Ljava/lang/String;)V", "CATEGORIES", "getCATEGORIES", "setCATEGORIES", "DETAIL_RECIPES", "getDETAIL_RECIPES", "setDETAIL_RECIPES", "LIST_CATEGORIES", "getLIST_CATEGORIES", "setLIST_CATEGORIES", "PAGE", "getPAGE", "setPAGE", "SEARCH_RECIPES", "getSEARCH_RECIPES", "setSEARCH_RECIPES", "app_debug"})
public final class ApiEndpoint {
    @org.jetbrains.annotations.NotNull()
    public static final com.resep.resepmasakan.networking.ApiEndpoint INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String BASEURL = "https://masak-apa-tomorisakura.vercel.app";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String PAGE = "/api/recipes/{page}";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String CATEGORIES = "/api/categorys/recipes";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String LIST_CATEGORIES = "/api/categorys/recipes/{key}";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String DETAIL_RECIPES = "/api/recipe/{key}";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String SEARCH_RECIPES = "/api/search/?q={query}";
    
    private ApiEndpoint() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBASEURL() {
        return null;
    }
    
    public final void setBASEURL(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPAGE() {
        return null;
    }
    
    public final void setPAGE(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCATEGORIES() {
        return null;
    }
    
    public final void setCATEGORIES(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLIST_CATEGORIES() {
        return null;
    }
    
    public final void setLIST_CATEGORIES(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDETAIL_RECIPES() {
        return null;
    }
    
    public final void setDETAIL_RECIPES(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSEARCH_RECIPES() {
        return null;
    }
    
    public final void setSEARCH_RECIPES(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}