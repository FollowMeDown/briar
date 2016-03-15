package org.briarproject.android;

import org.briarproject.CoreEagerSingletons;
import org.briarproject.CoreModule;
import org.briarproject.android.contact.ContactListFragment;
import org.briarproject.android.contact.ConversationActivity;
import org.briarproject.android.forum.AvailableForumsActivity;
import org.briarproject.android.forum.CreateForumActivity;
import org.briarproject.android.forum.ForumActivity;
import org.briarproject.android.forum.ForumListFragment;
import org.briarproject.android.forum.ReadForumPostActivity;
import org.briarproject.android.forum.ShareForumActivity;
import org.briarproject.android.forum.WriteForumPostActivity;
import org.briarproject.android.identity.CreateIdentityActivity;
import org.briarproject.android.invitation.AddContactActivity;
import org.briarproject.android.panic.PanicPreferencesActivity;
import org.briarproject.android.panic.PanicResponderActivity;
import org.briarproject.plugins.AndroidPluginsModule;
import org.briarproject.system.AndroidSystemModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
		modules = {CoreModule.class, AppModule.class, AndroidModule.class,
				AndroidPluginsModule.class, AndroidSystemModule.class})
public interface AndroidComponent extends CoreEagerSingletons {

	void inject(SplashScreenActivity activity);

	void inject(SetupActivity activity);

	void inject(NavDrawerActivity activity);

	void inject(PasswordActivity activity);

	void inject(BriarService activity);

	void inject(PanicResponderActivity activity);

	void inject(PanicPreferencesActivity activity);

	void inject(AddContactActivity activity);

	void inject(ConversationActivity activity);

	void inject(CreateIdentityActivity activity);

	void inject(TestingActivity activity);

	void inject(AvailableForumsActivity activity);

	void inject(WriteForumPostActivity activity);

	void inject(CreateForumActivity activity);

	void inject(ShareForumActivity activity);

	void inject(ReadForumPostActivity activity);

	void inject(ForumActivity activity);

	void inject(SettingsActivity activity);

	void inject(ContactListFragment fragment);

	void inject(ForumListFragment fragment);

	// Eager singleton load
	void inject(AndroidModule.EagerSingletons init);

}