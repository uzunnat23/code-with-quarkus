import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {ChildhoodComponent} from "./pages/welcome/childhood/childhood.component";
import {SelfEsteemComponent} from "./pages/welcome/self-esteem/self-esteem.component";
import {RelationshipComponent} from "./pages/welcome/relationship/relationship.component";
import {MeaningOfLifeComponent} from "./pages/welcome/meaning-of-life/meaning-of-life.component";
import {DepressionComponent} from "./pages/welcome/depression/depression.component";
import {TestBekaComponent} from "./pages/welcome/test-beka/test-beka.component";
import {TestZangaComponent} from "./pages/welcome/test-zanga/test-zanga.component";
import {LoginComponent} from "./pages/login/login.component";
import {RegistrationComponent} from "./pages/registration/registration.component";
import {SendMessageComponent} from "./pages/welcome/send-message/send-message.component";
import {ReadMessageComponent} from "./pages/welcome/read-message/read-message.component";
import {SendMessageGuard} from "./pages/welcome/send-message/send-message.guard";
import {ReadMessageGuard} from "./pages/welcome/read-message/read-message.guard";
import {LogoutComponent} from "./pages/logout/logout.component";

const routes: Routes = [
  {path: '', pathMatch: 'full', redirectTo: '/welcome'},
  {path: 'welcome', loadChildren: () => import('./pages/welcome/welcome.module').then(m => m.WelcomeModule)},
  {path: 'childhood', component: ChildhoodComponent},
  {path: 'self-esteem', component: SelfEsteemComponent},
  {path: 'relationship', component: RelationshipComponent},
  {path: 'meaning-of-life', component: MeaningOfLifeComponent},
  {path: 'depression', component: DepressionComponent},
  {path: 'test-beka', component: TestBekaComponent},
  {path: 'test-zanga', component: TestZangaComponent},
  {path: 'login', component: LoginComponent},
  {path: 'logout', component: LogoutComponent},
  {path: 'registration', component: RegistrationComponent},
  {path: 'send-message', component: SendMessageComponent, canActivate: [SendMessageGuard]},
  {path: 'read-message', component: ReadMessageComponent, canActivate: [ReadMessageGuard]},
];

@NgModule({
  imports: [RouterModule.forRoot(routes, {anchorScrolling: 'enabled'})],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
