package com.resep.resepmasakan.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001(B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\u0012\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001b\u00a8\u0006)"}, d2 = {"Lcom/resep/resepmasakan/activities/ListCategoriesActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "listCategoriesAdapter", "Lcom/resep/resepmasakan/adapter/ListCategoriesAdapter;", "getListCategoriesAdapter", "()Lcom/resep/resepmasakan/adapter/ListCategoriesAdapter;", "setListCategoriesAdapter", "(Lcom/resep/resepmasakan/adapter/ListCategoriesAdapter;)V", "modelCategories", "Lcom/resep/resepmasakan/model/ModelCategories;", "getModelCategories", "()Lcom/resep/resepmasakan/model/ModelCategories;", "setModelCategories", "(Lcom/resep/resepmasakan/model/ModelCategories;)V", "modelCategoriesList", "", "Lcom/resep/resepmasakan/model/ModelRecipes;", "getModelCategoriesList", "()Ljava/util/List;", "setModelCategoriesList", "(Ljava/util/List;)V", "strKategori", "", "getStrKategori", "()Ljava/lang/String;", "setStrKategori", "(Ljava/lang/String;)V", "strKategoriKey", "getStrKategoriKey", "setStrKategoriKey", "getListCategories", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "Companion", "app_debug"})
public final class ListCategoriesActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.Nullable()
    private com.resep.resepmasakan.model.ModelCategories modelCategories;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.resep.resepmasakan.model.ModelRecipes> modelCategoriesList;
    @org.jetbrains.annotations.Nullable()
    private com.resep.resepmasakan.adapter.ListCategoriesAdapter listCategoriesAdapter;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String strKategoriKey;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String strKategori;
    @org.jetbrains.annotations.NotNull()
    public static final com.resep.resepmasakan.activities.ListCategoriesActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LIST_CATEGORIES = "strListCategories";
    private java.util.HashMap _$_findViewCache;
    
    public ListCategoriesActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.resep.resepmasakan.model.ModelCategories getModelCategories() {
        return null;
    }
    
    public final void setModelCategories(@org.jetbrains.annotations.Nullable()
    com.resep.resepmasakan.model.ModelCategories p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.resep.resepmasakan.model.ModelRecipes> getModelCategoriesList() {
        return null;
    }
    
    public final void setModelCategoriesList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.resep.resepmasakan.model.ModelRecipes> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.resep.resepmasakan.adapter.ListCategoriesAdapter getListCategoriesAdapter() {
        return null;
    }
    
    public final void setListCategoriesAdapter(@org.jetbrains.annotations.Nullable()
    com.resep.resepmasakan.adapter.ListCategoriesAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrKategoriKey() {
        return null;
    }
    
    public final void setStrKategoriKey(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrKategori() {
        return null;
    }
    
    public final void setStrKategori(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getListCategories() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/resep/resepmasakan/activities/ListCategoriesActivity$Companion;", "", "()V", "LIST_CATEGORIES", "", "setWindowFlag", "", "activity", "Landroid/app/Activity;", "bits", "", "on", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void setWindowFlag(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity, int bits, boolean on) {
        }
    }
}