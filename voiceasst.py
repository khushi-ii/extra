# import pyttsx3
# import speech_recognition as sr
# import webbrowser
# import datetime
# import pyjokes
# import time

# # Initialize the speech engine
# engine = pyttsx3.init()

# # Set speaking rate (adjust as needed)
# engine.setProperty('rate', 150)

# # Set volume (0.0 to 1.0)
# engine.setProperty('volume', 1.0)

# # Select a voice (optional, depending on your system's available voices)
# voices = engine.getProperty('voices')
# engine.setProperty('voice', voices[0].id)  # Change index if you want a different voice

# def speechtx(text):
#     """Function to convert text to speech."""
#     engine.say(text)
#     engine.runAndWait()

# def sptext():
#     """Function to capture speech and convert it to text."""
#     recognizer = sr.Recognizer()
#     with sr.Microphone() as source:
#         print("Listening...")
#         recognizer.adjust_for_ambient_noise(source, duration=1)
#         audio = recognizer.listen(source)
#         try:
#             print("Recognizing...")
#             data = recognizer.recognize_google(audio)
#             print(f"You said: {data}")
#             return data
#         except sr.UnknownValueError:
#             print("Could not understand audio")
#             return ""
#         except sr.RequestError as e:
#             print(f"Could not request results; {e}")
#             speechtx("Sorry, I am unable to connect to the service.")
#             return ""

# if __name__ == '__main__':
#     if "hey peter" in sptext().lower():
#         while True:
#             spoken_text = sptext().lower()  # Convert the recognized speech to lowercase for easier matching

#             if "your name" in spoken_text:
#                 name = "My name is peter."
#                 speechtx(name)
#             elif "how old are you    " in spoken_text or "what is your age" in spoken_text or "old are you" in spoken_text:
#                 age = "I am two years old."
#                 speechtx(age)
#             elif "time" in spoken_text:
#                 current_time = datetime.datetime.now().strftime("%I:%M %p")
#                 speechtx(f"The current time is {current_time}")
#             elif "youtube" in spoken_text:
#                 speechtx("Opening YouTube")
#                 webbrowser.open("https://www.youtube.com/")
#             elif "joke" in spoken_text:
#                 joke1 = pyjokes.get_joke(language="en", category="neutral")
#                 speechtx(joke1)
#             elif "exit" in spoken_text or "quit" in spoken_text or "stop" in spoken_text:
#                 speechtx("Thank you for using the service. Goodbye!")
#                 break
#             time.sleep(5)
#     else:
#        print("thanks")    





import pyttsx3
import speech_recognition as sr
import webbrowser
import datetime
import pyjokes
import time

# Initialize the speech engine
engine = pyttsx3.init()

# Set speaking rate (adjust as needed)
engine.setProperty('rate', 150)

# Set volume (0.0 to 1.0)
engine.setProperty('volume', 1.0)

# Select a voice (optional, depending on your system's available voices)
voices = engine.getProperty('voices')
engine.setProperty('voice', voices[0].id)  # Change index if you want a different voice

def speechtx(text):
    """Function to convert text to speech."""
    engine.say(text)
    engine.runAndWait()

def sptext():
    """Function to capture speech and convert it to text."""
    recognizer = sr.Recognizer()
    with sr.Microphone() as source:
        print("Listening...")
        recognizer.adjust_for_ambient_noise(source, duration=1)
        audio = recognizer.listen(source)
        try:
            print("Recognizing...")
            data = recognizer.recognize_google(audio)
            print(f"You said: {data}")
            return data
        except sr.UnknownValueError:
            print("Could not understand audio")
            return ""
        except sr.RequestError as e:
            print(f"Could not request results; {e}")
            speechtx("Sorry, I am unable to connect to the service.")
            return ""

if __name__ == '__main__':
    while True:
        print("Say 'Hey Peter' to start...")
        if "hey peter" in sptext().lower():
            speechtx("Hello! How can I assist you?")
            while True:
                spoken_text = sptext().lower()  # Convert the recognized speech to lowercase for easier matching

                if "your name" in spoken_text:
                    name = "My name is Peter."
                    speechtx(name)
                elif "how old are you" in spoken_text or "what is your age" in spoken_text or "old are you" in spoken_text:
                    age = "I am two years old."
                    speechtx(age)
                elif "time" in spoken_text:
                    current_time = datetime.datetime.now().strftime("%I:%M %p")
                    speechtx(f"The current time is {current_time}")
                elif "youtube" in spoken_text:
                    speechtx("Opening YouTube")
                    webbrowser.open("https://www.youtube.com/")
                elif "joke" in spoken_text:
                    joke1 = pyjokes.get_joke(language="en", category="neutral")
                    speechtx(joke1)
                elif "exit" in spoken_text or "quit" in spoken_text or "stop" in spoken_text:
                    speechtx("Thank you for using the service. Goodbye!")
                    break
                else:
                    speechtx("I didn't catch that. Can you please repeat?")
                time.sleep(2)  # Wait a bit before listening again
            break  # Exit the outer loop after the user says "exit"
        else:
            speechtx("Please say 'Hey Peter' to wake me up.")


