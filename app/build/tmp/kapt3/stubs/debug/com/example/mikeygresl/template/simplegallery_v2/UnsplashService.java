package com.example.mikeygresl.template.simplegallery_v2;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0002\u0010\u0011J2\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\nH\'JD\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\r\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\nH\'\u00a8\u0006\u0012"}, d2 = {"Lcom/example/mikeygresl/template/simplegallery_v2/UnsplashService;", "", "photos", "Lretrofit2/Call;", "", "Lcom/example/mikeygresl/template/simplegallery_v2/objects/Photo;", "page", "", "count", "orderBy", "", "search", "Lcom/example/mikeygresl/template/simplegallery_v2/objects/SearchResults;", "query", "orientation", "collections", "SearchQuery", "UnsplashSource", "app_debug"})
public abstract interface UnsplashService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "photos")
    public abstract retrofit2.Call<java.util.List<com.example.mikeygresl.template.simplegallery_v2.objects.Photo>> photos(@retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "per_page")
    int count, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "order_by")
    java.lang.String orderBy);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search")
    public abstract retrofit2.Call<com.example.mikeygresl.template.simplegallery_v2.objects.SearchResults> search(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "query")
    java.lang.String query, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "per_page")
    int count, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "orientation")
    java.lang.String orientation, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "collections")
    java.lang.String collections);
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/example/mikeygresl/template/simplegallery_v2/UnsplashService$SearchQuery;", "", "text", "", "orientation", "collections", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCollections", "()Ljava/lang/String;", "getOrientation", "getText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class SearchQuery {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String text = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String orientation = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String collections = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getText() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOrientation() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCollections() {
            return null;
        }
        
        public SearchQuery(@org.jetbrains.annotations.NotNull()
        java.lang.String text, @org.jetbrains.annotations.Nullable()
        java.lang.String orientation, @org.jetbrains.annotations.Nullable()
        java.lang.String collections) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.mikeygresl.template.simplegallery_v2.UnsplashService.SearchQuery copy(@org.jetbrains.annotations.NotNull()
        java.lang.String text, @org.jetbrains.annotations.Nullable()
        java.lang.String orientation, @org.jetbrains.annotations.Nullable()
        java.lang.String collections) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J2\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\u0010H\u0002J@\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\u0013H\u0002J\u001e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0016J\u001e\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00192\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u001c"}, d2 = {"Lcom/example/mikeygresl/template/simplegallery_v2/UnsplashService$UnsplashSource;", "Landroid/arch/paging/PositionalDataSource;", "Lcom/example/mikeygresl/template/simplegallery_v2/objects/Photo;", "service", "Lcom/example/mikeygresl/template/simplegallery_v2/UnsplashService;", "(Lcom/example/mikeygresl/template/simplegallery_v2/UnsplashService;)V", "query", "Lcom/example/mikeygresl/template/simplegallery_v2/UnsplashService$SearchQuery;", "getService", "()Lcom/example/mikeygresl/template/simplegallery_v2/UnsplashService;", "getPhotos", "", "page", "", "size", "callback", "Lkotlin/Function1;", "", "getSearchingPhotos", "Lkotlin/Function2;", "loadInitial", "params", "Landroid/arch/paging/PositionalDataSource$LoadInitialParams;", "Landroid/arch/paging/PositionalDataSource$LoadInitialCallback;", "loadRange", "Landroid/arch/paging/PositionalDataSource$LoadRangeParams;", "Landroid/arch/paging/PositionalDataSource$LoadRangeCallback;", "setSearchingQuery", "app_debug"})
    public static final class UnsplashSource extends android.arch.paging.PositionalDataSource<com.example.mikeygresl.template.simplegallery_v2.objects.Photo> {
        private com.example.mikeygresl.template.simplegallery_v2.UnsplashService.SearchQuery query;
        @org.jetbrains.annotations.NotNull()
        private final com.example.mikeygresl.template.simplegallery_v2.UnsplashService service = null;
        
        public final void setSearchingQuery(@org.jetbrains.annotations.Nullable()
        com.example.mikeygresl.template.simplegallery_v2.UnsplashService.SearchQuery query) {
        }
        
        private final void getSearchingPhotos(com.example.mikeygresl.template.simplegallery_v2.UnsplashService.SearchQuery query, int page, int size, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.util.List<com.example.mikeygresl.template.simplegallery_v2.objects.Photo>, kotlin.Unit> callback) {
        }
        
        private final void getPhotos(int page, int size, kotlin.jvm.functions.Function1<? super java.util.List<com.example.mikeygresl.template.simplegallery_v2.objects.Photo>, kotlin.Unit> callback) {
        }
        
        @java.lang.Override()
        public void loadRange(@org.jetbrains.annotations.NotNull()
        android.arch.paging.PositionalDataSource.LoadRangeParams params, @org.jetbrains.annotations.NotNull()
        android.arch.paging.PositionalDataSource.LoadRangeCallback<com.example.mikeygresl.template.simplegallery_v2.objects.Photo> callback) {
        }
        
        @java.lang.Override()
        public void loadInitial(@org.jetbrains.annotations.NotNull()
        android.arch.paging.PositionalDataSource.LoadInitialParams params, @org.jetbrains.annotations.NotNull()
        android.arch.paging.PositionalDataSource.LoadInitialCallback<com.example.mikeygresl.template.simplegallery_v2.objects.Photo> callback) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.mikeygresl.template.simplegallery_v2.UnsplashService getService() {
            return null;
        }
        
        public UnsplashSource(@org.jetbrains.annotations.NotNull()
        com.example.mikeygresl.template.simplegallery_v2.UnsplashService service) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}