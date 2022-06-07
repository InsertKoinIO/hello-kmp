import SwiftUI
import shared

@main
struct iOSApp: App {
    
    init() {
        GreetingHelperKt.doInitKoin()
    }
    
	var body: some Scene {
		WindowGroup {
			ContentView()
		}
	}
}
