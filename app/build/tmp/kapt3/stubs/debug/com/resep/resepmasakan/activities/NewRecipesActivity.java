package com.resep.resepmasakan.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020%H\u0002J\u0012\u0010&\u001a\u00020!2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\b\u0010)\u001a\u00020!H\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u0006+"}, d2 = {"Lcom/resep/resepmasakan/activities/NewRecipesActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "categoriesAdapter", "Lcom/resep/resepmasakan/adapter/CategoriesAdapter;", "getCategoriesAdapter", "()Lcom/resep/resepmasakan/adapter/CategoriesAdapter;", "setCategoriesAdapter", "(Lcom/resep/resepmasakan/adapter/CategoriesAdapter;)V", "modelCategoriesList", "", "Lcom/resep/resepmasakan/model/ModelCategories;", "getModelCategoriesList", "()Ljava/util/List;", "setModelCategoriesList", "(Ljava/util/List;)V", "modelRecipesList", "Lcom/resep/resepmasakan/model/ModelRecipes;", "getModelRecipesList", "setModelRecipesList", "newRecipesAdapter", "Lcom/resep/resepmasakan/adapter/NewRecipesAdapter;", "getNewRecipesAdapter", "()Lcom/resep/resepmasakan/adapter/NewRecipesAdapter;", "setNewRecipesAdapter", "(Lcom/resep/resepmasakan/adapter/NewRecipesAdapter;)V", "page", "", "getPage", "()I", "setPage", "(I)V", "getCategories", "", "getListNewResep", "getSearchRecipe", "query", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showRecyclerRecipe", "Companion", "app_debug"})
public final class NewRecipesActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.resep.resepmasakan.model.ModelRecipes> modelRecipesList;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.resep.resepmasakan.model.ModelCategories> modelCategoriesList;
    @org.jetbrains.annotations.Nullable()
    private com.resep.resepmasakan.adapter.NewRecipesAdapter newRecipesAdapter;
    @org.jetbrains.annotations.Nullable()
    private com.resep.resepmasakan.adapter.CategoriesAdapter categoriesAdapter;
    private int page = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.resep.resepmasakan.activities.NewRecipesActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public NewRecipesActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.resep.resepmasakan.model.ModelRecipes> getModelRecipesList() {
        return null;
    }
    
    public final void setModelRecipesList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.resep.resepmasakan.model.ModelRecipes> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.resep.resepmasakan.model.ModelCategories> getModelCategoriesList() {
        return null;
    }
    
    public final void setModelCategoriesList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.resep.resepmasakan.model.ModelCategories> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.resep.resepmasakan.adapter.NewRecipesAdapter getNewRecipesAdapter() {
        return null;
    }
    
    public final void setNewRecipesAdapter(@org.jetbrains.annotations.Nullable()
    com.resep.resepmasakan.adapter.NewRecipesAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.resep.resepmasakan.adapter.CategoriesAdapter getCategoriesAdapter() {
        return null;
    }
    
    public final void setCategoriesAdapter(@org.jetbrains.annotations.Nullable()
    com.resep.resepmasakan.adapter.CategoriesAdapter p0) {
    }
    
    public final int getPage() {
        return 0;
    }
    
    public final void setPage(int p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showRecyclerRecipe() {
    }
    
    private final void getSearchRecipe(java.lang.String query) {
    }
    
    private final void getCategories() {
    }
    
    private final void getListNewResep(int page) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lcom/resep/resepmasakan/activities/NewRecipesActivity$Companion;", "", "()V", "setWindowFlag", "", "activity", "Landroid/app/Activity;", "bits", "", "on", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void setWindowFlag(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity, int bits, boolean on) {
        }
    }
}