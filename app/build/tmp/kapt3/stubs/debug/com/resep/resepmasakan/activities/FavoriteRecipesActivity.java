package com.resep.resepmasakan.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0011H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lcom/resep/resepmasakan/activities/FavoriteRecipesActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "helper", "Lcom/resep/resepmasakan/realm/RealmHelper;", "getHelper", "()Lcom/resep/resepmasakan/realm/RealmHelper;", "setHelper", "(Lcom/resep/resepmasakan/realm/RealmHelper;)V", "modelRecipes", "", "Lcom/resep/resepmasakan/model/ModelRecipes;", "getModelRecipes", "()Ljava/util/List;", "setModelRecipes", "(Ljava/util/List;)V", "getFavorite", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onResume", "app_debug"})
public final class FavoriteRecipesActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.resep.resepmasakan.model.ModelRecipes> modelRecipes;
    @org.jetbrains.annotations.Nullable()
    private com.resep.resepmasakan.realm.RealmHelper helper;
    private java.util.HashMap _$_findViewCache;
    
    public FavoriteRecipesActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.resep.resepmasakan.model.ModelRecipes> getModelRecipes() {
        return null;
    }
    
    public final void setModelRecipes(@org.jetbrains.annotations.NotNull()
    java.util.List<com.resep.resepmasakan.model.ModelRecipes> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.resep.resepmasakan.realm.RealmHelper getHelper() {
        return null;
    }
    
    public final void setHelper(@org.jetbrains.annotations.Nullable()
    com.resep.resepmasakan.realm.RealmHelper p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getFavorite() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
}