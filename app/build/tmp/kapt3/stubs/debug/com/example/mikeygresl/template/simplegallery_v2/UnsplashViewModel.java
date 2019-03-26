package com.example.mikeygresl.template.simplegallery_v2;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\r\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u000f0\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00130\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0005*\u0004\u0018\u00010\u00150\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/example/mikeygresl/template/simplegallery_v2/UnsplashViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "backgroundExecutor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "currentQuery", "Lcom/example/mikeygresl/template/simplegallery_v2/UnsplashService$SearchQuery;", "okHttp", "Lokhttp3/OkHttpClient;", "pagesWithPlaceholders", "Landroid/arch/paging/PagedList$Config;", "pagesWithoutPlaceholders", "photos", "Landroid/arch/paging/PagedList;", "Lcom/example/mikeygresl/template/simplegallery_v2/objects/Photo;", "getPhotos", "()Landroid/arch/paging/PagedList;", "retrofit", "Lretrofit2/Retrofit;", "service", "Lcom/example/mikeygresl/template/simplegallery_v2/UnsplashService;", "source", "Lcom/example/mikeygresl/template/simplegallery_v2/UnsplashService$UnsplashSource;", "uiExecutor", "Landroid/os/Handler;", "search", "query", "", "Companion", "app_debug"})
public final class UnsplashViewModel extends android.arch.lifecycle.ViewModel {
    private final okhttp3.OkHttpClient okHttp = null;
    private final retrofit2.Retrofit retrofit = null;
    private final com.example.mikeygresl.template.simplegallery_v2.UnsplashService service = null;
    private final com.example.mikeygresl.template.simplegallery_v2.UnsplashService.UnsplashSource source = null;
    private final android.arch.paging.PagedList.Config pagesWithoutPlaceholders = null;
    private final android.arch.paging.PagedList.Config pagesWithPlaceholders = null;
    private final android.os.Handler uiExecutor = null;
    private final java.util.concurrent.ExecutorService backgroundExecutor = null;
    private com.example.mikeygresl.template.simplegallery_v2.UnsplashService.SearchQuery currentQuery;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.paging.PagedList<com.example.mikeygresl.template.simplegallery_v2.objects.Photo> photos = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APP_ID = "e0ce1e3f6f7ab1c7c6a95910136646b8879b9453fb4188b516f2ae3b229ce4b9";
    public static final com.example.mikeygresl.template.simplegallery_v2.UnsplashViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.paging.PagedList<com.example.mikeygresl.template.simplegallery_v2.objects.Photo> getPhotos() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.arch.paging.PagedList<com.example.mikeygresl.template.simplegallery_v2.objects.Photo> search(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
        return null;
    }
    
    public UnsplashViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/mikeygresl/template/simplegallery_v2/UnsplashViewModel$Companion;", "", "()V", "APP_ID", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}